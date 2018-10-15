package com.controlmatic.posclient.models.cardreader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
@XmlAccessorType(XmlAccessType.FIELD)
public class BonusCardResult{
    long bonusCardNumber;
    String bonusState;
    int goodThruMonth;
    int goodThruYear;
}