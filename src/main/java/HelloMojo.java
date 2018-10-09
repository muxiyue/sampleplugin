import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

// 在处理源码的时候，plugin-tools 会把使用了 @Mojo
// 注解或 Javadoc 里包含 @goal 注释的类来当作一个 Mojo 类。
///**
// * @goal hello
// */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter private String msg;

    @Parameter private List<String> lists;

//    可以通过configuration配置，也可以通过-DinlineArgs=inlineInput传入参数值。
    @Parameter(property = "inlineArgs") private String inlineArgs;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(String.format("hello world msg->%s, lists->%s, inlineArgs->%s ", msg, lists, inlineArgs));

    }

}
