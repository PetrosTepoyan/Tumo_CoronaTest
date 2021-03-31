
//
//  TestInformationSection.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class TestInformationSection: View {
    private var titleLabel = TextView()
    private val vStack: LinearLayout by lazy {
        val s = LinearLayout()
        s.axis = .vertical
        s.alignment = .leading
        s.distribution = .equalSpacing
        s.spacing = 30
        s
    }
    private val parameter = InformationBlock(title = "Parameter", value = "nCov-2019 RNA detection (RT PCR)")
    private val sample = InformationBlock(title = "Sample", value = "Nasopharyngeal swab")
    private val result = InformationBlock(title = "Result", value = "Negative", isTestResult = true)
    
    constructor() : super(frame = CGRect.init() {
        titleLabel.text = "Test information"
        titleLabel.font = UIFont.preferredFont(forTextStyle = .title3).bold()
        this.addSubview(vStack)
        vStack.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(vStack.leadingAnchor.constraint(equalTo = leadingAnchor), vStack.trailingAnchor.constraint(equalTo = trailingAnchor), vStack.heightAnchor.constraint(equalTo = heightAnchor)))
        vStack.addArrangedSubview(titleLabel)
        vStack.addArrangedSubview(parameter)
        vStack.addArrangedSubview(sample)
        vStack.addArrangedSubview(result)
        result.translatesAutoresizingMaskIntoConstraints = false
        result.trailingAnchor.constraint(equalTo = trailingAnchor).isActive = true
    }
    
    required constructor?(coder: NSCoder) {
        throw Exception("init(coder:) has not been implemented")
    }
}
