package com.hcen.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QuestInfo {
//    # 序号, 题目, 总选项, 正确项, 选项1, 选项2, 选项3, 选项4
//1,心电图反应心肌的,4,1,兴奋的产生传导和恢复过程,机械收缩过程,兴奋产生和传导过程,兴奋的恢复期
//2,根据离子学说静息电位的产生是由于,4,1,K+平衡电位,Na+平衡电位,Cl-平衡电位,Ca2+平衡电位
//    序号,
    private long id;
//    题目,
    private String quest;
//    总选项,
    private int total;
//    正确项,
    private String one;
//    选项1,
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
}
