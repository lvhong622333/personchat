package com.lvhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestXIController {

    @RequestMapping("/TestXIController")
    @ResponseBody
    public String testDemo(){

        return "<html>\\n<body>\\n<h2>异常反馈</h2>\\n<ul>\\n<li>来源系统单据中，公司名称与发票购方名称不一致。单据中的公司名称为“上海复地投资管理有限公司-G000010-蜂巢”，而发票购方名称为“上海复地投资管理有限公司”。</li>\\n<li>报销金额与发票金额不一致。单据中的报销金额为5309元，而发票价税合计金额为5309元和5550元。</li>\\n<li>发票不含税金额与记账金额(含税)不一致。单据中的发票不含税金额为5008.49元，而记账金额(含税)为5309元。</li>\\n<li>发票税额与税额不一致。单据中的发票税额为0.00元，而税额为300.51元。</li>\\n<li>缺少重要信息，如报销事由、计划付款日期、预计付款日期、是否缺票等。</li>\\n<li>费用明细区的缺票金额与费用合计金额不一致。单据中的缺票金额为5309元，而费用合计金额为5309元。</li>\\n</ul>\\n</body>\\n</html>";
    }

}
