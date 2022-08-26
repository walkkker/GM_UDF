package udf;

// 必须继承自该 UDF class
import org.apache.hadoop.hive.ql.exec.UDF;

public class GM_UDF extends UDF {

    // 此处 书写 evaluate 方法，定义 UDF的 输入/输出
    // 注意，可以进行【重载】，针对【不同的参数列表】进行【不同的执行逻辑】
    public String evaluate(String input) {
        // 此处输入 处理逻辑，最后返回 String类型即可
        return "1";
    }

}
