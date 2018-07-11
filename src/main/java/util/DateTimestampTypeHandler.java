//package util;
//
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.MappedJdbcTypes;
//import org.apache.ibatis.type.MappedTypes;
//import org.apache.ibatis.type.TypeHandler;
//
//import java.sql.*;
//import java.util.Date;
//
//@MappedTypes({Date.class})
//@MappedJdbcTypes({Timestamp.class})
//public class DateTimestampTypeHandler implements TypeHandler<Date> {
//
//    @Override
//    public void setParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
//
//    }
//
//    @Override
//    public Date getResult(ResultSet rs, String columnName) throws SQLException {
//        return null;
//    }
//
//    @Override
//    public Date getResult(ResultSet rs, int columnIndex) throws SQLException {
//        return null;
//    }
//
//    @Override
//    public Date getResult(CallableStatement cs, int columnIndex) throws SQLException {
//        return null;
//    }
//}
