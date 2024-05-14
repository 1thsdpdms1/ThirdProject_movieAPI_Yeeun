package org.spring.groupAir.sign.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "signFile")
public class SignFileEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "signFile_id")
    private Long id;

    @Column(nullable = false)
    public String signNewFile;

    @Column(nullable = false)
    public String signOldFile;

    @Column(nullable = false)
    public String content;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sign_id")
    private SignEntity signEntity;


}
