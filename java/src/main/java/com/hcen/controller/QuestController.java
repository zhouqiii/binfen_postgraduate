package com.hcen.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hcen.bean.QuestInfo;
import com.hcen.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quest")
public class QuestController  {

    @Autowired
    private QuestService questService;


    @PostMapping("")
    public boolean save(@RequestBody QuestInfo questInfo) {
        boolean save = questService.save(questInfo);
        return save;
    }
    @GetMapping("/one")
    public QuestInfo list(@RequestParam("id") long id) {
        QuestInfo id1 = questService.getOne(new QueryWrapper<QuestInfo>().eq("id", id));
        return id1;
    }
}
