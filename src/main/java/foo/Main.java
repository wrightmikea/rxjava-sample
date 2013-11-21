package foo;
import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.util.functions.Action1;


/**
 * <p>Main. </p>
 *
 * @author anavarro - Apr 27, 2013
 *
 */
public class Main {

    /**
     * main.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        final List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        
        Observable.toObservable(strings).subscribe(new Action1() {
            public void call(Object aArg0) {
             System.out.println("call " + aArg0);   
            }
        });
        
        
        
        

    }

}
