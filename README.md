# marcopolo
## 概述 ：
* marcopolo是全自动智能爬虫，并提供数据流即时处理的功能。
## 一：
### 实现目的：
* 实现全自动智能收集网页数据，并且能够自动解析非格式化数据，数据进入kafka存储，提供给数据流处理。
* 数据流处理，sql过滤关键词，生成结果集。根据具体sql而定，关键词由关键词表而定。
* 计算结果数据sink存储至搜索引擎，marcopolo-web提供结果集查询。
* 应用在feecn系统数据搜集模块，提供数据收集。
## 二：
### 功能概览：
#### 收集模块：
* 自动发起收集
* 解析数据、格式化数据
* 存储
#### 流处理模块：
* 自动加载数据库参数生成sql，在时间窗口内过滤。 
* 以小时为单位生成结果集。
* 结果集存储至搜索引擎。
#### 搜索模块（如何做到智能搜索？）
* 待定
## 三：
### 技术选型：

#### marcopolo travel the world of internet.

