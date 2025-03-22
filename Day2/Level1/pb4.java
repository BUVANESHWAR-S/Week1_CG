public class pb4 {
    public static void main(String[] args) {
        double cost_price = 129, selling_price = 191, profit;
        double profit_percenrage;
        profit = selling_price - cost_price;
        profit_percenrage  = (profit/cost_price)*100;
        System.out.printf("he Cost Price is INR %f and Selling Price is INR %f\n",cost_price, selling_price);
        System.out.printf("The Profit is INR %f and the Profit Percentage is %f",profit, profit_percenrage);
    }
}