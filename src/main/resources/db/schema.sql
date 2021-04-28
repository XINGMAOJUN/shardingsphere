CREATE TABLE `user_info`  (
  `id` varchar(50)   NOT NULL primary key ,
  `group_code` varchar(10)    ,
  `project_id` varchar(50) ,
  `name` varchar(10)  ,
  `age` int(11) ,
  `sex` varchar(10) ,
  `create_time` datetime(0) ,
  `update_time` datetime(0)
);