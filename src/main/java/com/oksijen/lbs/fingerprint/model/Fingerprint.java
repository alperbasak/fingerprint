package com.oksijen.lbs.fingerprint.model;

import javax.persistence.*;

@Entity
@Table(name = "FINGERPRINT")
public class Fingerprint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column
    private MeasurementType measurementType;

    @Embedded
    private Position position;

    @Column
    private long tx_id;

    @Column
    private int lac;

    @Column
    private int cid;

    @Column
    private double signal;

    public Fingerprint(MeasurementType measurementType, Position position, long tx_id, int lac, int cid, double signal) {
        this.measurementType = measurementType;
        this.position = position;
        this.tx_id = tx_id;
        this.lac = lac;
        this.cid = cid;
        this.signal = signal;
    }

    public Fingerprint(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MeasurementType getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(MeasurementType measurementType) {
        this.measurementType = measurementType;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public long getTx_id() {
        return tx_id;
    }

    public void setTx_id(long tx_id) {
        this.tx_id = tx_id;
    }

    public int getLac() {
        return lac;
    }

    public void setLac(int lac) {
        this.lac = lac;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getSignal() {
        return signal;
    }

    public void setSignal(double signal) {
        this.signal = signal;
    }

    @Override
    public String toString() {
        return "Fingerprint{" +
                "id=" + id +
                ", measurementType=" + measurementType +
                ", position=" + position +
                ", tx_id=" + tx_id +
                ", lac=" + lac +
                ", cid=" + cid +
                ", signal=" + signal +
                '}';
    }
}
