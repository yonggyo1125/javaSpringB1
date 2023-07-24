package exam04.config;

import exam04.members.UserDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
@ComponentScan(basePackages = "exam04.members",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes= ManualBean.class)
)
 */
/*
@ComponentScan(basePackages = "exam04.members",
    excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes=UserDao.class)
)
*
*/
@ComponentScan(basePackages = "exam04.members",
    excludeFilters = @ComponentScan.Filter(type=FilterType.ASPECTJ, pattern="exam04.members.*Dao")
)
public class AppCtx {

}
