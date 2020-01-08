package person.zxc.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import person.zxc.ms.model.User;
import person.zxc.ms.service.UserService;

import java.util.Map;

/**
 * @author zxccong
 * @date 2019/12/27
 */
@RestController
@RequestMapping("/auth")
public class AuthController {



    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,String> registerUser){
        User user = new User();
        user.setNickname(registerUser.get("username"));
        // 记得注册的时候把密码加密一下
        user.setPassword(bCryptPasswordEncoder.encode(registerUser.get("password")));
        user.setRole("ROLE_USER");
//        User save = userRepository.save(user);
//        return save.toString();
        return userService.insert(user)?user.toString():null;
//        return null;
    }
}
