package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Month")
@Data
@NoArgsConstructor
public class Month {

    @Id
    @Column(name="num")
    private int number;

    @Column(name="nm")
    private String name;
}
