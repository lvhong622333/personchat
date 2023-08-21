package com.lvhong;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public void shouldAnswerWithTrue()
    {
        boolean containNumber = this.isContainNumber("1.16");
        System.out.println(containNumber);
    }


    public boolean isContainNumber(String str) {
        //"[-|+]?[0-9]*[.]?[0-9]*"   经过自己测试没问题
        Boolean strResult = str.matches("^-?(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,9})?$");
        return strResult;
    }
}
