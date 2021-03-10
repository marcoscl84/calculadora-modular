package digital.innovation.one.utils;

import digital.innovation.one.utils.interno.DivHelper;
import digital.innovation.one.utils.interno.MultiHelper;
import digital.innovation.one.utils.interno.SubHelper;
import digital.innovation.one.utils.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
