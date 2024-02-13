package org.zerock.jdbcex.domain;

import lombok.Builder;
import lombok.Cleanup;
import lombok.Getter;
import lombok.ToString;
import org.zerock.jdbcex.dao.ConnectionUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
@ToString
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}

