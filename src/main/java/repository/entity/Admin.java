package repository.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminNo;
    @Column(length = 30)
    private String adminId;
    @Column(length = 300)
    private String adminPassword;
    @Column(length = 20)
    private String adminIpAddress;
    private LocalDateTime adminLastSignDate;
}
