package com.hcen.bean;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Data
@Accessors(chain = true)
@ToString
@Slf4j
public class QuestInfo {
    //    # 序号, 题目, 总选项, 正确项, 选项1, 选项2, 选项3, 选项4
//1,心电图反应心肌的,4,1,兴奋的产生传导和恢复过程,机械收缩过程,兴奋产生和传导过程,兴奋的恢复期
//2,根据离子学说静息电位的产生是由于,4,1,K+平衡电位,Na+平衡电位,Cl-平衡电位,Ca2+平衡电位
//    序号,
    private long id;
    //    题目,
    private String quest;
    //    总选项,
    private String total;
    //    答案,
    private String one;
    //    选项1,
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;


    // 位置信息
    // 试卷名称
    private String paper;
    //    学科名称
    private String subject;
    // 体型名称
    private String type;
    // 序号
    private String no;


    public static QuestInfo creatFromMap(Map<String, Object> line) {
        QuestInfo questInfo = new QuestInfo();
        String[] key = {
                "学科", "题型", "序号", "问题",
                "选项1", "选项2", "选项3", "选项4", "答案",
        };
        try {

            questInfo.setSubject(hn(line.get(key[0])));
            questInfo.setType(hn(line.get(key[1])));
            questInfo.setNo(hn(line.get(key[2])));
            questInfo.setQuest(hn(line.get(key[3])));

            questInfo.setAns1(hn(line.get(key[4])));
            questInfo.setAns2(hn(line.get(key[5])));
            questInfo.setAns3(hn(line.get(key[6])));
            questInfo.setAns4(hn(line.get(key[7])));
            questInfo.setOne(hn(line.get(key[8])));

        } catch (NullPointerException npe) {
            log.error("line data error " + line.toString());
            return null;
        }


        return questInfo;
    }

    private static String hn(Object o) {
        if (null == o) {
            return "";
        } else {
            return o.toString();
        }
    }
}
