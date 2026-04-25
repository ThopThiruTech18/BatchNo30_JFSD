package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
