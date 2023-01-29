package com.knifelish.tool.constant;

import java.util.Arrays;
import java.util.List;

/**
 * versions fo browser
 *
 * @author <a href="mailto:cs.liaow@gmail.com">liao</a>
 * Create on 2023/1/23
 */
public interface Browser {

    /**
     * <a href="https://en.wikipedia.org/wiki/Google_Chrome_version_history">Google Chrome version history</a>
     */
    List<String> CHROME = Arrays.asList(
            "88.0.4324", "89.0.4389", "90.0.4430", "91.0.4472", "92.0.4515",
            "93.0.4577", "94.0.4606", "95.0.4638", "96.0.4664", "97.0.4692", "98.0.4758",
            "99.0.4844", "100.0.4896", "101.0.4951", "102.0.5005", "103.0.5060", "104.0.5112",
            "105.0.5195", "106.0.5249", "107.0.5304", "108.0.5359", "109.0.5414", "110.0.5481"
    );

    /**
     * <a href="https://en.wikipedia.org/wiki/Safari_version_history">Safari version history</a>
     */
    List<String> SAFARI = Arrays.asList(
            "16.2", "15.6.1", "14.1.2", "13.1.2", "12.1.2"
    );

    /**
     * <a href="https://www.wandoujia.com/apps/7672441/history">Edge version history</a>
     */
    List<String> EDGE = Arrays.asList(
            "106.0.1370.52", "106.0.1370.47", "105.0.1343.50", "105.0.1343.48", "105.0.1343.34",
            "105.0.1343.27", "104.0.1293.70", "104.0.1293.63", "104.0.1293.60", "104.0.1293.55",
            "104.0.1293.47", "103.0.1264.77", "103.0.1264.71", "103.0.1264.62", "103.0.1264.51",
            "102.0.1245.44", "102.0.1245.39", "101.0.1210.53", "101.0.1210.47", "101.0.1210.39",
            "100.0.1185.50", "100.0.1185.43", "100.0.1185.36", "99.0.1150.55", "99.0.1150.46",
            "99.0.1150.39", "99.0.1150.30", "98.0.1108.62", "98.0.1108.55", "97.0.1072.78",
            "97.0.1072.69", "97.0.1072.55", "96.0.1054.62", "96.0.1054.36", "95.0.1020.32"
    );

    /**
     * <a href="https://www.wandoujia.com/apps/36557/history">UC browser version history</a>
     */
    List<String> UC = Arrays.asList(
            "15.1.5.1205", "15.1.4.1204", "15.1.2.1202", "15.1.1.1201", "15.0.9.1199",
            "15.0.7.1197", "15.0.6.1196", "15.0.5.1195", "15.0.4.1194", "15.0.3.1193",
            "15.0.2.1192", "15.0.1.1191", "15.0.0.1190", "14.1.0.1185", "14.0.0.1181",
            "13.9.9.1180", "13.9.8.1179", "13.9.7.1178", "13.9.6.1177", "13.9.5.1176",
            "13.9.4.1175", "13.9.3.1174", "13.9.2.1173", "13.9.1.1172", "13.9.0.1171",
            "13.8.9.1170", "13.8.8.1169", "13.8.7.1168", "13.8.6.1167", "13.8.5.1166",
            "13.8.4.1165", "13.8.3.1164", "13.8.2.1163", "13.8.1.1162", "13.8.0.1161",
            "13.7.9.1160", "13.7.8.1159", "13.7.7.1158", "13.7.6.1157", "13.7.4.1155",
            "13.7.3.1154", "13.7.1.1152", "13.7.0.1151", "13.6.9.1150", "13.6.8.1149",
            "13.6.7.1148", "13.6.6.1146", "13.6.5.1145", "13.6.3.1143", "13.6.2.1142",
            "13.6.1.1141", "13.6.0.1140", "13.5.9.1139", "13.5.8.1138", "13.5.7.1137",
            "13.5.6.1136", "13.5.5.1135", "13.5.4.1134", "13.5.3.1133", "13.5.2.1132",
            "13.5.1.1131", "13.5.0.1130", "13.4.9.1129", "13.4.8.1128", "13.4.7.1127",
            "13.4.5.1125", "13.4.4.1124", "13.4.2.1122", "13.4.1.1121", "13.4.0.1120",
            "13.3.9.1119", "13.3.8.1118", "13.3.7.1117", "13.3.6.1116", "13.3.5.1115",
            "13.3.4.1114", "13.3.3.1113", "13.3.2.1112", "13.3.1.1111", "13.2.9.1109",
            "13.2.8.1108", "13.2.7.1107", "13.2.6.1106", "13.2.5.1105", "13.2.3.1103",
            "13.2.2.1102", "13.2.1.1101", "13.2.0.1100", "13.1.9.1099", "13.1.8.1098",
            "13.1.7.1097", "13.1.6.1096", "13.1.5.1095", "13.1.4.1094", "13.1.3.1093",
            "13.1.2.1092", "13.1.0.1090", "13.0.8.1088", "13.0.7.1087", "13.0.6.1086",
            "13.0.5.1085", "13.0.4.1084", "13.0.3.1083", "13.0.2.1082", "13.0.1.1081",
            "13.0.0.1080", "12.9.9.1079", "12.9.8.1078", "12.9.7.1077", "12.9.6.1076",
            "12.9.5.1075", "12.9.4.1074", "12.9.2.1072", "12.9.1.1071", "12.9.0.1070",
            "12.8.9.1069", "12.8.8.1068", "12.8.7.1067", "12.8.6.1066", "12.8.5.1065",
            "12.8.4.1064", "12.8.2.1062", "12.8.0.1060", "12.7.9.1059", "12.7.8.1058",
            "12.7.6.1056", "12.7.4.1054", "12.7.2.1052", "12.7.0.1050", "12.6.8.1048",
            "12.6.6.1046", "12.6.2.1042", "12.6.1.1041", "12.6.0.1040", "12.5.9.1039",
            "12.5.6.1036", "12.5.5.1035", "12.5.4.1034", "12.5.2.1032", "12.5.0.1030",
            "12.4.8.1028", "12.4.6.1026", "12.4.4.1024", "12.4.3.1023", "12.4.2.1022",
            "12.4.0.1020", "12.3.8.1018", "12.3.6.1016", "12.3.0.1010", "12.2.8.1008",
            "12.2.6.1006", "12.2.4.1004", "12.2.2.1002"
    );


    /**
     * <a href="https://www.wandoujia.com/apps/44621/history">QQ browser version history</a>
     */
    List<String> QQ = Arrays.asList(
            "13.3", "13.2", "13.1", "13.0", "12.9", "12.8", "12.7", "12.6", "12.5", "12.4", "12.3", "12.2", "12.1"
    );


    /**
     * <a href="https://www.wandoujia.com/apps/280151/history">baidu browser version history</a>
     */
    List<String> BAIDU = Arrays.asList(
            "5.26.0.30", "5.22.0.30", "5.13.0.30", "5.10.0.30", "5.9.0.31", "5.7.5.30",
            "5.2.0.30", "4.21.5.31", "4.21.5.30", "4.20.4.31", "4.19.5.30", "4.19.0.30",
            "4.18.0.32", "4.18.0.31", "4.16.0.30", "4.15.0.30", "4.14.5.31", "4.14.5.30",
            "4.14.0.30", "4.13.5.31", "4.9.5.36", "4.9.5.34", "7.20.11.0", "7.19.13.0",
            "7.19.11.0", "7.19.10.0", "7.18.21.0", "7.18.20.0", "7.18.11.0", "7.17.12.0",
            "7.16.12.0", "7.15.15.0", "7.14.14.0", "7.14.13.0", "7.13.13.0", "7.12.12.0",
            "7.11.13.0", "7.11.12.0", "7.10.12.0", "7.9.12.0", "7.8.12.0", "7.7.13.0",
            "7.6.12.0", "7.6.11.0", "7.5.22.0", "7.4.14.0", "7.3.14.0", "7.2.14.0", "7.1.12.0",
            "7.0.33.0", "7.0.15.0", "6.4.14.0", "6.3.20.0", "6.3.13.0", "6.2.20.0", "6.2.18.0",
            "6.2.16.0", "6.1.13.0", "6.0.23.0", "6.0.21.0", "6.0.15.0", "5.7.5.0", "5.7.3.0",
            "5.6.4.0", "5.6.3.0", "5.5.3.0", "5.4.5.0", "5.3.4.0", "5.2.3.0", "5.1.0.0"
    );

    /**
     * <a href="https://www.wandoujia.com/apps/596157/history">wechat browser version history</a>
     */
    List<String> WECHAT = Arrays.asList(
            "6.7.3", "6.6.7", "8.0.27", "8.0.25", "8.0.24", "8.0.23", "8.0.22", "8.0.21",
            "8.0.20", "8.0.19", "8.0.18", "8.0.16", "8.0.15", "8.0.14", "8.0.11", "8.0.10",
            "8.0.9", "8.0.7", "8.0.6", "8.0.3", "8.0.2", "8.0.1", "8.0.0", "7.0.22", "7.0.21",
            "7.0.20", "7.0.19", "7.0.18", "7.0.17", "7.0.16", "7.0.15", "7.0.14", "7.0.13",
            "7.0.12", "7.0.11", "7.0.10", "7.0.9", "7.0.8", "7.0.7", "7.0.6", "7.0.5", "7.0.4",
            "7.0.3", "7.0.0", "6.7.2", "6.6.6", "6.6.5", "6.6.3", "6.6.2", "6.6.1", "6.6.0",
            "6.5.24", "6.5.22", "6.5.19", "6.5.16", "6.5.13", "6.5.10", "6.5.8", "6.5.7", "6.5.6"
    );
}
