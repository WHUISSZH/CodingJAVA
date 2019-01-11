/**
 * @author callmezh
 * StringBuilder class 的构造方法与普通方法简例
 * 注意理解StringBuilder 的实质，存储容量与实际存储量的关系
 */
public class TestStringBuilder {
    void printResult(){
        //create StringBuilder instance
        //存储容量为16, 在计算机内部字符构造器是一个字符数组，实际存储的字符串长度超出容量时
        //就利用新的数组替换现有数组。新数组大小为 2 * （oldArray.length + 1)
//        StringBuilder strBuilder1 = new StringBuilder();
        //指定存储容量
//        StringBuilder strBuilder2 = new StringBuilder(10);
        //存储容量为16 + str.length()
        StringBuilder strBuilder3 = new StringBuilder("w");
        System.out.println(strBuilder3.capacity());
        char [] love = {'j', 'a', 'v', 'a'};
        //change StringBuilder instance
        System.out.println(strBuilder3.append(love));
        //offset 表示插入数组的下标，len表示从offset开始的数组元素个数
        System.out.println(strBuilder3.append(love, 2, 2));
        //将一个基本类型值作为字符串追加到字符串构造器
        System.out.println(strBuilder3.append(1));
        //追加一个字符串到字符串构造器
        System.out.println(strBuilder3.append("love"));
        //删除startIndex 到 endIndex - 1位置上的字符
        System.out.println(strBuilder3.delete(0, 2));
        //删除给定索引位置的字符
        System.out.println(strBuilder3.deleteCharAt(0));
        //在字符串构建器的给定索引位置插入数组的子数组
        System.out.println(strBuilder3.insert(1, love, 1, 2 ));
        //向字符串构造器的给定位置插入数据
        System.out.println(strBuilder3.insert(0, love));
        //向字符串构造器给定位置插入基本类型值
        System.out.println(strBuilder3.insert(0, 9.3));
        //向构造器指定位置插入一个字符串
        System.out.println(strBuilder3.insert(0, "callmezh"));
        //将构造器从 startIndex 到 endIndex - 1 的位置的字符替换为给定的字符串
        System.out.println(strBuilder3.replace(0, 6, "zh"));
        //倒置构造器的字符串
        System.out.println(strBuilder3.reverse());
        //将构造器指定索引位置上的字符设为新的字符
        strBuilder3.setCharAt(0, 'q');
        System.out.println(strBuilder3);

        //返回字符构造器的属性
        //返回字符串对象
        System.out.println(strBuilder3.toString());
        //返回构造器容量(能够存储最长字符串的长度)
        System.out.println(strBuilder3.capacity());
        //返回指定索引位置的字符
        System.out.println(strBuilder3.charAt(0));
        //返回构造器中的字符串实际存储的长度
        System.out.println(strBuilder3.length());

        //这句代码会报错，out bound, 证明我们不能访问超出字符串长度区域的数组，虽然说构造器是一个字符数组
        System.out.println(strBuilder3.charAt(25));
        //设置该构造器的新的长度,如果字符串长度超过新设置的长度，字符就会被截断,不足会被空字符‘\0000’填充，
        //此时存储的字符串长度刚好等于构造器长度，末尾是空字符，
        strBuilder3.setLength(30);
        System.out.println("1321213");
        System.out.println(strBuilder3.length());
        System.out.println(strBuilder3.charAt(28));
        System.out.println(strBuilder3.toString());
        //返回startIndex开始的子字符串
        System.out.println(strBuilder3.substring(10));
        //返回startIndex 到 endIndex - 1的子字符串
        System.out.println(strBuilder3.substring(0, 10));
        //减少用于字符串构造器的存储器大小
        strBuilder3.trimToSize();
        System.out.println(strBuilder3.capacity());

    }
}
