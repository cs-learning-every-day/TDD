/**
 * @author huayang (sunhuayangak47@gmail.com)
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression times(int multiplier);

    Expression plus(Expression addend);
}
