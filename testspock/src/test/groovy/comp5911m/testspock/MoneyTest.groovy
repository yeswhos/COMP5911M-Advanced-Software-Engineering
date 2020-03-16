package comp5911m.testspock


import spock.lang.*


class MoneyTest extends Specification {

    def oneFifty = new Money(1, 50)

    def "creating a Money"() {
        expect:
        oneFifty.getEuros() == 1
        oneFifty.getCents() == 50
    }

    def "creating a Money with cents too low"() {
        when: new Money(1, -1)
        then: thrown(IllegalArgumentException)
    }

    def "creating a Money with cents too high"() {
        when: new Money(1,100)
        then: thrown(IllegalArgumentException)
    }

    def "creating a Money with euros too low"() {
        setup:
        when: new Money(-1,1)
        then: thrown(IllegalArgumentException)
    }

    def "representing Money as a string"() {
        setup:
        def oneFive = new Money(1, 5)

        expect:
        oneFifty.toString() == "\u20ac1.50"
        oneFive.toString() == "\u20ac1.05"
    }

    def "test equal"() {
        setup:
        def oneFifty = new Money(1,50)
        def oneForty = new Money(1,40)
        def oneFourty = new Money(1,40)

        expect:
        oneFourty.equals(oneForty) == true;
        oneFifty.equals(oneFourty) == false;
    }

    def "test plus"() {
        when:
        def result = oneFifty.plus(amount)

        then:
        result.getEuros() == euros
        result.getCents() == cents

        where:
        amount           || euros | cents
        new Money(1, 0)  || 2     | 50
        new Money(0, 1)  || 1     | 51
        new Money(1, 49) || 2     | 99
        new Money(1, 50) || 3     | 0


    }
}
