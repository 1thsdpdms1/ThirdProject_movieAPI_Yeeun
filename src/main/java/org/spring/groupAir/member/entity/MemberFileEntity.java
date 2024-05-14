package org.spring.groupAir.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.board.entity.BoardEntity;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.role.Role;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "memberFile")
public class MemberFileEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberFile_id")
    private Long id;

    @Column(nullable = false)
    public String memberNewFile;

    @Column(nullable = false)
    public String memberOldFile;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private MemberEntity memberEntity;


}
