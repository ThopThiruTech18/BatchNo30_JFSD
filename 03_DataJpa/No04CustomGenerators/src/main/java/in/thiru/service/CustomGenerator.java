package in.thiru.service;

import java.io.Serializable;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Service;

@Service
public class CustomGenerator implements IdentifierGenerator{

	@Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {

        // Fetch last orderId
        String lastId = (String) session.createQuery(
                "SELECT o.orderId FROM Orders o ORDER BY o.orderId DESC LIMIT 1")
                .uniqueResult();

        int nextNumber = 1;

        if (lastId != null) {
            String numberPart = lastId.substring(9); // remove "IBM" //IBM0003
            nextNumber = Integer.parseInt(numberPart) + 1;
        }

        return "VERSIONIT" + String.format("%04d", nextNumber);
    }

}
