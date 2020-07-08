package Dump;

import org.hibernate.dialect.Dialect;

import java.sql.Types;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect(){
        registerColumnType(Types.BIT,"integer");
        registerColumnType(Types.VARCHAR,"");
    }
}
