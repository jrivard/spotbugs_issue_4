import java.util.concurrent.Callable;

public class MavenTest4
{
    void mavenTest4_anonymous() throws Exception
    {
        // this line triggers THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION
        // because JDK Callable declaration has call() method 'throws Exception'
        Callable<String> callable = new Callable<String>()
        {
            @Override
            public String call()
            {
                return "test";
            }
        };
        System.out.println( callable.call() );
    }

    void mavenTest4_lambda() throws Exception
    {
        // this line triggers THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION
        // because JDK Callable declaration has call() method 'throws Exception'
        Callable<String> callable = () -> "test";
        System.out.println( callable.call() );
    }
}