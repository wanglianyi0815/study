insert into prepay_extend (
         order_sn,
         biz_type,
         req_order_no,
         trade_no,
        discount_percent,          invoice_amt,          order_desc,          notify_status,          finish_time        ) values (          'CP2018010510120050213',          null,          null,          null,          1.000000000000000,          0.000000,          null,          0,          1515128616        )        ON DUPLICATE KEY UPDATE          order_sn=order_sn                                              ,discount_percent = 1.000000000000000                            ,invoice_amt = 0.000000
15128412        )        ON DUPLICATE KEY UPDATE          order_sn=order_sn
