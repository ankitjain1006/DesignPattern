import com.designpattern.strategy_pattern.problem_with_inheritance.IDuckInterface;
import com.designpattern.strategy_pattern.problem_with_inheritance.RubberDuck;
import com.designpattern.strategy_pattern.solution.Duck;
import com.designpattern.strategy_pattern.solution.display.YellowDisplay;
import com.designpattern.strategy_pattern.solution.eating.NoEatingStrategy;
import com.designpattern.strategy_pattern.solution.flying.NoFlyingStrategy;
import com.designpattern.strategy_pattern.solution.swim.NoSwimmingStrategy;
import org.junit.Assert;
import org.junit.Test;

public class StrategyPatternTest {

    @Test
    public void test() {
        IDuckInterface rubberDuck = new RubberDuck();
        Duck strategyRubberDuck = new Duck(new NoFlyingStrategy(), new NoEatingStrategy(), new YellowDisplay(), new NoSwimmingStrategy());
        Assert.assertEquals(rubberDuck.swim(), strategyRubberDuck.swim());
    }
}
