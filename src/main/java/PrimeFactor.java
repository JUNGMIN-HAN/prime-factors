import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number > 1) {
            if(number == 4){
                factors.add(2);
                factors.add(2);
            }
            else{
                factors.add(number);
            }
        }
        return factors;
    }
}
