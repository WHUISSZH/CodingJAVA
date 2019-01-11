import java.io.IOException;

/**
 * @author callmezh
 * main 函数
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        QuotientWithException result = new QuotientWithException();
//        result.printResult();

//        ChainedExceptionDemo result = new ChainedExceptionDemo();
//        result.printResult();

//        TestCircleWithCustomException.printResult();

        //测试方法重抛出异常的类型
//        TestCircleWithCustomException.testRethrow();

//        TestFileClass.printResult();

//        WriteData.printResult();

//        ReadData.printResult();

//        ReadFileFromURL result = new ReadFileFromURL();
//        result.printResult();

//        WebCrawler result = new WebCrawler();
//        result.printResult();

//        Quiz_12_1_NumberFormationException result = new Quiz_12_1_NumberFormationException();
//        result.printResult();

//        Quiz_12_3_ArrayIndexOutBoundsException result = new Quiz_12_3_ArrayIndexOutBoundsException();
//        result.printResult();

        Quiz_12_4_ThrowIllegalArgumentException result = new Quiz_12_4_ThrowIllegalArgumentException();
        result.catchException();
    }
}
