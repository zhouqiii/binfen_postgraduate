package com.hcen.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hcen.bean.QuestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface QuestInfoMapper extends BaseMapper<QuestInfo> {
}
