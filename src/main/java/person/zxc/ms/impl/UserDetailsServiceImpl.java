package person.zxc.ms.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import person.zxc.ms.model.JwtUser;
import person.zxc.ms.model.User;
import person.zxc.ms.service.UserService;
//import person.zxc.springsecurity.model.JwtUser;
//import person.zxc.springsecurity.model.User;
//import person.zxc.springsecurity.repository.UserRepository;

/**
 * @author zxccong
 * @date 2019/12/27
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    //    @Autowired
//    private UserRepository userRepository;
    @Autowired
    private UserService userService;

//    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(s);
        User user = userService.selectById(s);
        return new JwtUser(user);
    }

}


