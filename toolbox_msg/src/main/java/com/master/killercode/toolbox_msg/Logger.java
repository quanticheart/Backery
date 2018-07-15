package com.master.killercode.toolbox_msg;

import android.util.Log;

public class Logger {

    /**
     * V - Detailed (lowest priority)
     * D - Debugging
     * I - Information
     * W - Notice
     * E - Error
     * wtf - Throwable
     */

    private static String DETAILED = "Detailed";
    private static String DEBUGGING = "Debugging";
    private static String INFORMATION = "Information";
    private static String NOTICE = "Notice";
    private static String ERROR = "Error";
    private static String EXCEPTION = "Exception";

    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Only message
     *
     * @param msg message
     */
    public static void SysPrintDetailed(String msg) {
        System.out.print(DETAILED + " " + msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void SysPrintDebugging(String msg) {
        System.out.print(DEBUGGING + " " + msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void SysPrintInformation(String msg) {
        System.out.print(INFORMATION + " " + msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void SysPrintNotice(String msg) {
        System.out.print(NOTICE + " " + msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void SysPrintError(String msg) {
        System.out.print(ERROR + " " + msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void SysPrint(String tag, String msg) {
        System.out.print(tag + " " + msg);
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void SysPrint(String msg) {
        System.out.print(msg);
    }


    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Detailed() {
        Log.v(DETAILED, "");
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void DetailedWithoutTag(String msg) {
        Log.v("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Detailed(String msg) {
        Log.v(DETAILED, msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void Detailed(String tag, String msg) {
        Log.v(tag, msg);
    }


    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Debugging() {
        Log.d(DEBUGGING, "");
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void DebuggingWithoutTag(String msg) {
        Log.v("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Debugging(String msg) {
        Log.d(DEBUGGING, msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void Debugging(String tag, String msg) {
        Log.d(tag, msg);
    }

    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Information() {
        Log.i(INFORMATION, "");
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void InformationWithoutTag(String msg) {
        Log.v("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Information(String msg) {
        Log.i(INFORMATION, msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void Information(String tag, String msg) {
        Log.i(tag, msg);
    }

    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Notice() {
        Log.w(NOTICE, "");
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void NoticeWithoutTag(String msg) {
        Log.v("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Notice(String msg) {
        Log.w(NOTICE, msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void Notice(String tag, String msg) {
        Log.w(tag, msg);
    }

    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Error() {
        Log.e(ERROR, "");
    }

    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void ErrorWithoutTag(String msg) {
        Log.v("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Error(String msg) {
        Log.e(ERROR, msg);
    }

    /**
     * full
     *
     * @param tag tag message log
     * @param msg message
     */
    public static void Error(String tag, String msg) {
        Log.e(tag, msg);
    }

    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Simple
     */
    public static void Exception() {
        Log.wtf(EXCEPTION, "");
    }


    /**
     * Only message full, without tag
     *
     * @param msg message
     */
    public static void ExceptionWithoutTag(String msg) {
        Log.wtf("", msg);
    }

    /**
     * Only message
     *
     * @param msg message
     */
    public static void Exception(String msg) {
        Log.wtf(EXCEPTION, msg);
    }

    /**
     * Only message full, without tag
     *
     * @param Throwable catch's message Exception
     */
    public static void ExceptionWithoutTag(Throwable Throwable) {
        Log.wtf("", Throwable);
    }

    /**
     * full
     *
     * @param tag       tag message log
     * @param Throwable catch's message Exception
     */
    public static void Exception(String tag, Throwable Throwable) {
        Log.wtf(tag, Throwable);
    }

    /**
     * Only message
     *
     * @param Throwable catch's message Exception
     */
    public static void Exception(Throwable Throwable) {
        Log.wtf(EXCEPTION, Throwable);
    }

    /**
     * Only message
     *
     * @param tag       tag message log
     * @param msg       message
     * @param Throwable catch's message Exception
     */
    public static void Exception(String tag, String msg, Throwable Throwable) {
        Log.wtf(tag, msg, Throwable);
    }

    /**
     * Only message
     *
     * @param Throwable catch's message Exception
     */
    public static void ExceptionTraceString(Throwable Throwable) {
        Log.getStackTraceString(Throwable);
    }

    //////////////////////

}
