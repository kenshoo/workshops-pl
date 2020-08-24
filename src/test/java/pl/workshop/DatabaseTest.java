/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pl.workshop;

import org.jooq.DSLContext;
import org.junit.Test;
import pl.workshop.database.JooqProvider;

import static org.junit.Assert.*;

public class DatabaseTest {

    static final DSLContext jooq = JooqProvider.create();

    @Test public void selectOne() {
        jooq.createSchemaIfNotExists("test");
        System.out.println(jooq.fetch("select now()").get(0));
    }
}
