		<result property="remark"       column="remark"       />
		<association property="dept"    column="dept_id" javaType="SysDept" resultMap="deptResult" />
		<collection  property="roles"   javaType="java.util.List"        resultMap="RoleResult" />
	</resultMap>
	<resultMap id="deptResult" type="SysDept">
		<id     property="deptId"   column="dept_id"     />
		<result property="parentId" column="parent_id"   />
		<result property="deptName" column="dept_name"   />
		<result property="orderNum" column="order_num"   />
		<result property="leader"   column="leader"      />
		<result property="status"   column="dept_status" />
	</resultMap>
	<resultMap id="RoleResult" type="SysRole">
		<id     property="roleId"       column="role_id"        />
		<result property="roleName"     column="role_name"      />
		<result property="roleKey"      column="role_key"       />
	</resultMap>

	<delete id="deleteUserPost" parameterType="Long">
 		delete from sys_user_post where user_id in
 		<foreach collection="array" item="userId" open="(" separator="," close=")">
 			#{userId}
        </foreach> 
 	</delete>
	
	<insert id="batchUserPost">
		insert into sys_user_post(user_id, post_id) values
		<foreach item="item" index="index" collection="list" separator=",">
			(#{item.userId},#{item.postId})
		</foreach>
	</insert>