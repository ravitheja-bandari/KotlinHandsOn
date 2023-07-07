package com.rt.kotlinhandson

class AppVersionComparator : Comparator<String> {
    override fun compare(appVersion1: String, appVersion2: String): Int {
        val appVersion1Arr =
            appVersion1.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val appVersion2Arr =
            appVersion2.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in appVersion1Arr.indices) {
            val diff = appVersion1Arr[i].toInt() - appVersion2Arr[i].toInt()
            if (diff != 0) {
                return diff
            }
        }
        return 0
    }

    /*
    @Override
    public int compare(String appVersion1, String appVersion2) {

    String[] appVersion1Arr = appVersion1.split("\\.");
    String[] appVersion2Arr = appVersion2.split("\\.");
    for (int i = 0; i < appVersion1Arr.length; i++) {
    int diff = Integer.parseInt(appVersion1Arr[i]) - Integer.parseInt(appVersion2Arr[i]);
    if (diff != 0) {
    return diff;
    }
    }
    return 0;
    }
    */
}