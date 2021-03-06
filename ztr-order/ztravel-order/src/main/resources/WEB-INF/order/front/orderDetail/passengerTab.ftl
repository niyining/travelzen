
    <#list passengers as passenger>
    <#if (passenger.country)?? && passenger.country != ''>
       <tr>
            <input type="hidden" name="passengerIdTd" value="${(passenger.id)!}">
            <input type="hidden" name="credentialType-hidden" value="${(passenger.credentialType)!}">
            <input type="hidden" class="firstNameTd" value="${(passenger.firstName)!}">
            <input type="hidden" class="lastNameTd" value="${(passenger.lastName)!}">
            <input type="hidden" class="firstNameEnTd" value="${(passenger.firstEnName)!}">
            <input type="hidden" class="lastNameEnTd" value="${(passenger.lastEnName)!}">
            <td><span class="nameTd">${(passenger.name)!}</span></td>
            <td><span class="nameEnTd">${(passenger.enName)!}</span></td>
            <td class="countryTd">${passenger.country!}</td>
            <td class="genderTd"><#if passenger.gender?? && passenger.gender=="MALE">男<#else>女</#if></td>
            <td class="passengerTypeTd"><#if passenger.passengerType?? && passenger.passengerType=="CHILD">儿童<#else>成人</#if></td>
            <td class="credentialTypeTd"><#if passenger.credentialType?? && passenger.credentialType=="IDCARD">身份证
                   <#elseif passenger.credentialType?? && passenger.credentialType=="PASSPORT">护照<#else>港澳通行证</#if></td>
            <td class="credentialNumTd">${passenger.credentialNum!}</td>
            <td class="credentialDeadLineTd">${passenger.credentialDeadLine!}</td>
            <td class="birthdayTd">${passenger.birthday!}</td>
        </tr>
        <#else>
        <tr>
            <input type="hidden" name="passengerIdTd" value="${(passenger.id)!}">
            <input type="hidden" name="credentialType-hidden" value="${(passenger.credentialType)!}">
            <input type="hidden" class="firstNameTd" value="${(passenger.firstName)!}">
            <input type="hidden" class="lastNameTd" value="${(passenger.lastName)!}">
            <input type="hidden" class="firstNameEnTd" value="${(passenger.firstEnName)!}">
            <input type="hidden" class="lastNameEnTd" value="${(passenger.lastEnName)!}">
            <td><span class="nameTd">${(passenger.name)!}</span></td>
            <td><span class="nameEnTd">${(passenger.enName)!}</span></td>
            <td class="genderTd"><#if passenger.gender?? && passenger.gender=="MALE">男<#else>女</#if></td>
            <td class="passengerTypeTd"><#if passenger.passengerType?? && passenger.passengerType=="CHILD">儿童<#else>成人</#if></td>
            <td class="credentialTypeTd"><#if passenger.credentialType?? && passenger.credentialType=="IDCARD">身份证
                   <#elseif passenger.credentialType?? && passenger.credentialType=="PASSPORT">护照<#else>港澳通行证</#if></td>
            <td class="credentialNumTd">${passenger.credentialNum!}</td>
            <td class="birthdayTd">${passenger.birthday!}</td>
        </tr>
        </#if>
    </#list>