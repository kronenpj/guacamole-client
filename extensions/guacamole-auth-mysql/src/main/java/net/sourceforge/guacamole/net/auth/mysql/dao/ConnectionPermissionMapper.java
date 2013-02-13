package net.sourceforge.guacamole.net.auth.mysql.dao;

import java.util.List;
import net.sourceforge.guacamole.net.auth.mysql.model.ConnectionPermissionExample;
import net.sourceforge.guacamole.net.auth.mysql.model.ConnectionPermissionKey;
import org.apache.ibatis.annotations.Param;

public interface ConnectionPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int countByExample(ConnectionPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int deleteByExample(ConnectionPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int deleteByPrimaryKey(ConnectionPermissionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int insert(ConnectionPermissionKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int insertSelective(ConnectionPermissionKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    List<ConnectionPermissionKey> selectByExample(ConnectionPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int updateByExampleSelective(@Param("record") ConnectionPermissionKey record, @Param("example") ConnectionPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 12 20:35:54 PST 2013
     */
    int updateByExample(@Param("record") ConnectionPermissionKey record, @Param("example") ConnectionPermissionExample example);
}