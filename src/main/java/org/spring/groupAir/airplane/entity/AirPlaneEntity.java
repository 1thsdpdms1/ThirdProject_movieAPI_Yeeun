package org.spring.groupAir.airplane.entity;

import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "airplane")
public class AirPlaneEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airplane_id")
    private Long id;


    @Column(nullable = false)
    public String fromTime;

    @Column(nullable = false)
    public String fromArea;


    @Column(nullable = false)
    public String ToTime;

    @Column(nullable = false)
    public String ToArea;

    @Column(nullable = false)
    public String airplane;
}
