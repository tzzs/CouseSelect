package xyz.tzz6.courseselect.Model.DO;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stu_id")
    private Long stu_id;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "academy")
    private String academy;

    @Column(name = "phone_number")
    private String phone_number;

    @ManyToOne
    private Role role;
}
