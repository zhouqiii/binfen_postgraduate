package com.hcen.controller;

import com.hcen.service.ImportService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "从试卷excel模板导入题库")
@RestController
@RequestMapping("/import")
public class ImportController {
    @Autowired
    ImportService importService;


    @PostMapping(value = "/paper", headers = "content-type=multipart/form-data")
    public String paper(@ApiParam(value="文件",required=true) @RequestPart("file") MultipartFile file) {
        importService.importExcel(file);
        return "";
    }

}
