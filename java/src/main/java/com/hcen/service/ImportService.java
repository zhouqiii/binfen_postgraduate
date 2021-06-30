package com.hcen.service;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.hcen.bean.QuestInfo;
import com.hcen.bean.Ret;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ImportService {


    public Object importExcel(MultipartFile file) {
//        log.debug("youwenti?");
        // 校验excel
        List<Map<String, Object>> read = null;
        read = getLines(file);

        List<QuestInfo> dataList = new ArrayList<>();
        for (Map<String, Object> line : read) {
            QuestInfo quest = QuestInfo.creatFromMap(line);
            if (quest != null) {
                dataList.add(quest);
            }
        }
        //处理指标数据的分类id
        log.debug("导入数据 " + dataList.size());
//        log.debug(dataList.toString());
        return Ret.ok();
    }

    private List<Map<String, Object>> getLines(MultipartFile file) {
        List<Map<String, Object>> read = null;
        try {
            InputStream inputStream = file.getInputStream();
            ExcelReader reader = ExcelUtil.getReader(inputStream, 0);
            int rowCount = reader.getRowCount();
            read = reader.read(0, 1, rowCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return read;
    }


}
