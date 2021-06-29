CREATE DATABASE `postgraduate` /*!40100 DEFAULT CHARACTER SET utf8mb4 */

create table quest_info
(
    id bigint auto_increment,
    quest varchar(256) default '' not null,
    `total` int default 4 not null comment '总选择项',
    `one` varchar(4) default 'C' not null comment '正确项',
    ans1 varchar(256) default '' not null,
    ans2 varchar(256) default '' not null,
    ans3 varchar(256) default '' not null,
    ans4 varchar(256) default '' not null,
    constraint quest_info_pk
        primary key (id)
)
    comment '题目主要数据';

