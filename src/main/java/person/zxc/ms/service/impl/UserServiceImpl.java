package person.zxc.ms.service.impl;

import person.zxc.ms.model.User;
import person.zxc.ms.mapper.UserMapper;
import person.zxc.ms.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxccong
 * @since 2020-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
