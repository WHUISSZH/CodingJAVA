/**
 * @author callmezh
 * 定义股票类
 */
public class Quiz_9_2_Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    /**
     * 重写构造函数
     * @param symbol 股票代码
     * @param name 股票名称
     * @param previousClosingPrice 昨日收盘价
     * @param currentPrice 现价
     */
    Quiz_9_2_Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }


    /**
     * 返回盈亏百分比
     * @return 盈亏百分比
     */
    String getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice + "%";
    }
}
