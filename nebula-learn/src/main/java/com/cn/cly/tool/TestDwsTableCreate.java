package com.cn.cly.tool;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: zlf
 * @Date: 2024/11/6 16:08
 */
public class TestDwsTableCreate {

    public static void main(String[] args) throws IOException {
        //工商
        //createTable("dim_ccx_code_conversion_di", "工商表", "/test/file/sql/ccx_code_conversion.txt");
        //createTable("dws_basic_di", "工商表", "/test/file/sql/basic.txt");
        //createTable("dws_basic_sub_di", "工商补充表", "/test/file/sql/basic-sub.txt");
        //createTable("dws_ent_branch_di", "分支机构", "/test/file/sql/branch.txt");
        //createTable("dws_ent_clear_di", "清算核查", "/test/file/sql/清算核查.txt");
        //createTable("dws_ent_abnormal_di", "经营异常", "/test/file/sql/经营异常.txt");
        //createTable("dws_ent_illegal_di", "严重违法", "/test/file/sql/严重违法.txt");
        //createTable("dws_ent_history_name_di", "曾用名", "/test/file/sql/曾用名.txt");
        //createTable("dws_cancel_notice_di", "注销备案", "/test/file/sql/注销备案.txt");
        //createTable("dws_ent_partner_cn_di", "工商公示股东", "/test/file/sql/公示股东.txt");
        //createTable("dws_ent_check_di", "抽查检查", "/test/file/sql/抽查检查.txt");
        //createTable("dws_ent_simple_cancel_di", "简易注销", "/test/file/sql/简易注销.txt");
        //createTable("dws_ent_partner_di", "股东（融合）", "/test/file/sql/股东-融合.txt");
        //createTable("dws_ent_simple_cancel_di", "变更", "/test/file/sql/变更.txt");
        //createTable("dws_ent_person_relation_di", "个企关系", "/test/file/sql/个企关系.txt");
        //createTable("dws_ent_pledge_di", "股权出质", "/test/file/sql/股权出质.txt");
        //createTable("dws_ent_change_di", "变更信息", "/test/file/sql/变更.txt");
        //createTable("dws_year_report_basic_di", "年报基本信息", "/test/file/sql/年报-基本信息.txt");
        //createTable("dws_year_report_website_di", "年报网站信息", "/test/file/sql/年报-网站信息.txt");


        //司法
        //createTable("dws_risk_court_announcement_di", "法院公告主表", "/test/file/sql/法院公告主表.txt");
        //createTable("dws_risk_court_announcement_sub_di", "法院公告主表-子表", "/test/file/sql/法院公告主表_sub.txt");
        //createTable("dws_risk_court_announcement_list_di", "法院公告当事人", "/test/file/sql/法院公告当事人.txt");
        //createTable("dws_bankruptcy_public_cases_di", "破产信息-公开案件主表", "/test/file/sql/破产信息-主表.txt");
        //createTable("dws_bankruptcy_public_cases_list_di", "破产信息-当事人", "/test/file/sql/破产信息-当事人表.txt");
        //createTable("dws_bankruptcy_public_announcement_di", "破产信息-公开公告", "/test/file/sql/破产信息-公开公告.txt");
        //createTable("dws_bankruptcy_judicative_paper_di", "破产信息-裁判文书", "/test/file/sql/破产信息-裁判文书.txt");
        //createTable("dws_final_case_di", "终本案件", "/test/file/sql/终本案件.txt");
        //createTable("dws_ent_dishonesty_di", "失信被执行-企业", "/test/file/sql/失信被执行-企业.txt");
        //createTable("dws_per_dishonesty_di", "失信被执行-gr", "/test/file/sql/失信被执行-gr.txt");
        //createTable("dws_ent_limited_con_di", "限制高消费-企业", "/test/file/sql/限高.txt");
        //createTable("dws_per_limited_con_di", "限制高消费", "/test/file/sql/限高.txt");
        //createTable("dws_filing_info_di", "立案信息", "/test/file/sql/立案信息.txt");
        //createTable("dws_filing_parties_di", "立案信息当于人", "/test/file/sql/立案信息当事人.txt");
        //createTable("dws_ent_justice_di", "司法协助基本信息", "/test/file/sql/司法协助基本信息.txt");
        //createTable("dws_ent_justice_freeze_di", "司法协助冻结", "/test/file/sql/司法协助冻结.txt");
        //createTable("dws_ent_justice_invalid_di", "司法协助失效", "/test/file/sql/司法协助失效.txt");
        //createTable("dws_ent_justice_keep_freeze_di", "司法协助续行冻结", "/test/file/sql/司法协助续行冻结.txt");
        //createTable("dws_ent_justice_unfreeze_di", "司法协助解冻", "/test/file/sql/司法协助解冻.txt");
        //createTable("dws_judicial_doc_di", "裁判文书", "/test/file/sql/裁判文书.txt");
        //createTable("dws_judicial_doc_sub_di", "裁判文书-子表", "/test/file/sql/裁判文书_sub.txt");
        //createTable("dws_judicial_doc_judge_di", "裁判文书-法官", "/test/file/sql/裁判文书-法官.txt");
        //createTable("dws_judicial_doc_party_di", "裁判文书-当事人", "/test/file/sql/裁判文书-当事人.txt");
        //createTable("dws_sitting_announc_di", "开庭公告", "/test/file/sql/开庭公告.txt");
        //createTable("dws_sitting_announc_sub_di", "开庭公告子表", "/test/file/sql/开庭公告-子表.txt");
        //createTable("dws_sitting_announc_parties_di", "开庭公告-当事人", "/test/file/sql/开庭公告-当事人.txt");
        //createTable("dws_ent_executee_di", "被执行人-企业", "/test/file/sql/被执行人-企业.txt");
        //createTable("dws_per_executee_di", "被执行人-gr", "/test/file/sql/被执行人-个人.txt");

        //知产
        //createTable("dws_ip_patent_info_di", "专利表", "/test/file/sql/专利表.txt");
        //createTable("dws_ip_patent_info_sub_di", "专利-子表", "/test/file/sql/专利-子表.txt");
        //createTable("dws_ip_patent_patentee_di", "专利相关权利人", "/test/file/sql/专利相关权利人.txt");
        //createTable("dws_ip_trademark_main_di", "商标详情", "/test/file/sql/商标表.txt");
        //createTable("dws_ip_trademark_owner_di", "商标申请人", "/test/file/sql/商标申请人表.txt");
        //createTable("dws_ip_trademark_class_dict_di", "商标分类", "/test/file/sql/商标分类字典.txt");
        //createTable("dws_ip_website_records_di", "网站备案", "/test/file/sql/网站备案.txt");
        //createTable("dws_ip_copyright_software_di", "软件著作权", "/test/file/sql/软著.txt");

        //上市
        //createTable("dws_stock_holder_di", "上市公司十大股东", "/test/file/sql/十大股东.txt");
        //createTable("dws_secumain_di", "证券主表", "/test/file/sql/证券主表.txt");
        //createTable("dws_nq_secumain_di", "三板证券主表", "/test/file/sql/三板证券主表.txt");

        //特色
        //createTable("dws_pj_overdue_list_di", "票据承兑人逾期名单", "/test/file/sql/票据承兑人逾期名单.txt");
        //createTable("dws_pj_sustain_overdue_list_di", "票据持续逾期名单", "/test/file/sql/票据持续逾期名单.txt");
        //createTable("dws_pj_undisclosed_list_di", "票据信用信息未披露名单", "/test/file/sql/票据信用信息未披露名单.txt");
        //createTable("dws_pj_delayed_disclosure_list_di", "票据延迟披露名单", "/test/file/sql/票据延迟披露名单.txt");
        //createTable("dws_pj_credit_info_detail_di", "票据承兑人信用信息详情", "/test/file/sql/票据承兑人信用信息详情.txt");

        //经营
        createTable("dws_nq_balancesheet_di", "三板资产负债表", "/test/file/sql/三板资产负债表.txt");
        //createTable("dws_nq_incstatement_di", "三板利润表", "/test/file/sql/三板利润表.txt");

        //klr
        //createTableByModel("ods_balance_sheet_v2", "非公开v2-资产负责表", "/test/file/sql/klr/financeV2-balance.txt");
        //createTableByModel("ods_profit_sheet_v2", "非公开v2-利润表", "/test/file/sql/klr/financeV2-profit.txt");
    }

    static List<String> MUST_FIELD = Arrays.asList("id", "data_id", "source_id", "channel", "is_history", "deleted", "update_dwd_time", "update_table_time");

    private static void createTable(String tableName, String tableComment, String path) throws IOException {
        List<String> list = TestFileUtils.readFileList(path);
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS `").append(tableName).append("`;").append("\r\n");
        sb.append("CREATE TABLE `").append(tableName).append("` (").append("\r\n");

        boolean uniqueIdFlag = false;
        boolean ccxCodeFlag = false;
        List<String> fields = new ArrayList<>();
        for (String s : list) {
            if (StringUtils.isBlank(s)) {
                continue;
            }
            String[] arr = s.split("\\s+");
            String field = arr[0];
            fields.add(field);
            if ("unique_id".equals(field)) {
                uniqueIdFlag = true;
            } else if ("ccx_code".equals(field)) {
                ccxCodeFlag = true;
            }
            String type = null;
            if (arr.length > 1) {
                type = arr[1];
            }
            String comment = null;
            if (arr.length > 2) {
                comment = arr[2];
            }

            if ("id".equals(field)) {
                sb.append("`id` bigint(22) NOT NULL AUTO_INCREMENT,\r\n");
            } else if ("data_id".equals(field)) {
                sb.append("`data_id` varchar(32) DEFAULT NULL COMMENT '数据唯一标识',\r\n");
            } else if ("source_id".equals(field)) {
                sb.append("`source_id` varchar(50) DEFAULT NULL COMMENT '数据源标识',\r\n");
            } else if ("channel".equals(field)) {
                sb.append("`channel` varchar(4) DEFAULT NULL COMMENT '渠道号(数据来源)',\r\n");
            } else if ("ccx_code".equals(field)) {
                sb.append("`ccx_code` varchar(32) DEFAULT NULL COMMENT '企业ccxCode',\r\n");
            } else if ("is_history".equals(field)) {
                sb.append("`is_history` tinyint DEFAULT NULL COMMENT '是否历史数据,0当前/1历史',\r\n");
            } else if ("deleted".equals(field)) {
                sb.append("`deleted` tinyint DEFAULT NULL COMMENT '是否有效数据,0有效/1无效',\r\n");
            } else if("update_dwd_time".equals(field)){
                sb.append("`update_dwd_time` datetime DEFAULT NULL COMMENT 'dwd更新时间，用于数据定位',\r\n");
            }else if("update_table_time".equals(field)){
                sb.append("`update_table_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',\r\n");
            }else {
                sb.append("`").append(field).append("` ").append(type).append(" DEFAULT NULL COMMENT '").append(comment).append("',\r\n");
            }

        }
        sb.append("PRIMARY KEY (`id`),\r\n");
        sb.append("UNIQUE KEY `udx_so_ch` (`source_id`,`channel`),\r\n");
        sb.append("UNIQUE KEY `idx_data_id` (`data_id`),\r\n");
        if (uniqueIdFlag) {
            sb.append("KEY `idx_unique_id` (`unique_id`),\r\n");
        }
        if (ccxCodeFlag) {
            sb.append("KEY `idx_ccx_code` (`ccx_code`),\r\n");
        }
        sb.append("KEY `idx_update_time` (`update_table_time`)\r\n");
        sb.append(") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='").append(tableComment).append("'\r\n");
        sb.append(";");

        System.err.println(sb.toString());

        for (String str : MUST_FIELD) {
            if (!fields.contains(str)) {
                System.err.println("!!!!!!!!!table:" + tableName + ", 不包含字段: " + str);
            }
        }

    }

    private static void createTableByModel(String tableName, String tableComment, String path) throws IOException {
        List<String> list = TestFileUtils.readFileList(path);
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS `").append(tableName).append("`;").append("\r\n");
        sb.append("CREATE TABLE `").append(tableName).append("` (").append("\r\n");

        boolean ccxCodeFlag = false;
        boolean updateTimeFlag = false;
        List<String> fields = new ArrayList<>();
        for (String s : list) {
            if (StringUtils.isBlank(s)) {
                continue;
            }
            String[] arr = s.split("\\s+");
            String field = arr[0];
            //处理大写字母为_小写字母
            field = convertToUnderscoreLowercase(field);

            fields.add(field);

            if ("ccx_code".equals(field)) {
                ccxCodeFlag = true;
            } else if ("update_time".equals(field)) {
                updateTimeFlag = true;
            }
            String type = null;
            if (arr.length > 1) {
                type = arr[1];
            }
            String comment = null;
            if (arr.length > 2) {
                comment = arr[2];
            }

            if ("id".equals(field)) {
                sb.append("`id` bigint(22) NOT NULL AUTO_INCREMENT,\r\n");
            } else if ("source_id".equals(field)) {
                sb.append("`source_id` varchar(50) DEFAULT NULL COMMENT '数据源标识',\r\n");
            } else if ("channel".equals(field)) {
                sb.append("`channel` varchar(4) DEFAULT NULL COMMENT '渠道号(数据来源)',\r\n");
            } else if ("ccx_code".equals(field)) {
                sb.append("`ccx_code` varchar(32) DEFAULT NULL COMMENT '企业ccxCode',\r\n");
            } else if("input_time".equals(field)){
                sb.append("input_time datetime DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',\r\n");
            }else if("update_time".equals(field)){
                sb.append("update_time datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',\r\n");
            }else {
                sb.append("`").append(field).append("` ").append(type).append(" DEFAULT NULL COMMENT '").append(comment).append("',\r\n");
            }

        }
        sb.append("PRIMARY KEY (`id`),\r\n");
        sb.append("UNIQUE KEY `udx_so_ch` (`source_id`,`channel`),\r\n");
        if (ccxCodeFlag) {
            sb.append("KEY `idx_ccx_code` (`ccx_code`),\r\n");
        }
        if (updateTimeFlag) {
            sb.append("KEY `idx_update_time` (`update_time`),\r\n");
        }
        sb.append("KEY `idx_input_time` (`input_time`)\r\n");
        sb.append(") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='").append(tableComment).append("'\r\n");
        sb.append(";");

        System.err.println(sb.toString());


    }

    public static String convertToUnderscoreLowercase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append('_');
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
