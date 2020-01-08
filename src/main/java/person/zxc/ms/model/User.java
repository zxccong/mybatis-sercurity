package person.zxc.ms.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxccong
 * @since 2020-01-08
 */
@Data
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 网名
     */
	private String nickname;
    /**
     * 真实姓名
     */
	@TableField("real_name")
	private String realName;
    /**
     * 密码
     */
	private String password;
    /**
     * 手机号
     */
	private String mobile;
    /**
     * 手机号区号
     */
	@TableField("area_code")
	private String areaCode;
    /**
     * 角色
     */
	private String role;
    /**
     * 创建时间
     */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
    /**
     * 删除标识
     */
	@TableField(fill = FieldFill.INSERT)
    @TableLogic
	private Integer deleted;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
