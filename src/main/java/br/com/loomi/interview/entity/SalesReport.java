package br.com.loomi.interview.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_sales_report")
public class SalesReport {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID salesReportId;

    @Column(name = "period")
    private LocalDateTime period;

    @Column(name = "total_seller")
    private BigDecimal totalSeller;

    @Column(name = "products_sold")
    private Integer productsSold;

    @Column(name = "path")
    private String path;

}
