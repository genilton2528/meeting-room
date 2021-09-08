package com.digital.crud.meetingroom.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "meetingroom")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "startHour", nullable = false)
    private String startHour;
    @Column(name = "endHour", nullable = false)
    private String endHour;

    public void setRoom(Room newRoom) {
        if ( newRoom != null ) {
            this.name = newRoom.name;
            this.date = newRoom.date;
            this.startHour = newRoom.startHour;
            this.endHour = newRoom.endHour;
        }
    }

    @Override
    public String toString() {
        return String.format("{\n\t\"id\": \"%d\", " +
                        "\n\t\"name\": \"%s\", " +
                        "\n\t\"date\": \"%s\", " +
                        "\n\t\"startHour\": \"%s\", " +
                        "\n\t\"endHour\": \"%s\"\n}\n\n", this.id, this.name, this.date, this.startHour, this.endHour);
    }
}
