package geektime.spring.data.simplejdbcdemo;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Administrator on 2019/4/21.
 */
@Data
@Builder
public class Foo {
    private Long id;
    private String bar;
}
