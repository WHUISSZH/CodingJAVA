public class TestCircleWithCustomException {
    static void printResult(){
        try {
            new CircleWithCustomException(2);
            new CircleWithCustomException(-5);
            //上一句语句会抛出异常，程序终止
            new CircleWithCustomException(23);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.printf("Number of objects created: %d", CircleWithCustomException.getNumOfObject());
    }

    static void testRethrow(){
        try{
            method();
            System.out.print("After the method call");
        }
        catch (InvalidRadiusException ex){
            System.out.print("InvalidException in method\n");
        }
        catch (Exception ex){
            System.out.print("Exception in testRethrow");
        }
    }

    /**
     * 不管方法声明的异常类型是什么，只看方法内部抛出的异常类型
     * 子类异常可抛出给父类，父类异常也可以抛出给子类
     * @throws Exception
     */
    static void method() throws Exception{
        try{
            new CircleWithCustomException(-56);
        }
        catch (InvalidRadiusException ex){
            System.out.print("InvalidException in method\n");
            throw ex;
        }
        catch (Exception ex){
            System.out.print("Exception in method\n");
            throw ex;
        }
    }
}
